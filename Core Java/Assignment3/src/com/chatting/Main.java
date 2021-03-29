package com.chatting;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    Random RandomUserID = new Random(10000);
    Random RandomRoomID = new Random(100);

    //Create a Chat Room
    public ChatRoom createChatRoom()
    {
        int roomID = RandomRoomID.nextInt(100);
        System.out.println("This is your Room ID : "+roomID);
        System.out.print("Enter your room name : ");
        sc.nextLine();
        String roomName = sc.nextLine();
        System.out.print("Enter your room password : ");
        String roomPassword = sc.next();
        LinkedList<User> u = new LinkedList<>();
        ChatRoom c = new ChatRoom(roomID, roomName, roomPassword,u);
        return c;
    }
    
    // Add User in Chat Room
    public LinkedList<User> addUser(LinkedList<User> list)
    {

        System.out.println("Enter User Details: ");
        int userID = RandomUserID.nextInt(10000);
        System.out.println("This is your user Id : "+userID);
        sc.nextLine();
        System.out.print("Enter the name of the user : ");
        String userName = sc.nextLine();
        System.out.print("Enter your user Password : ");
        String password = sc.next();
        User user = new User(userID, userName, password);
        list.add(user);
        return list;
    }
    
    //User Login
    public void userLogin(User u,ChatRoom c)
    {
        int i = 0;
        while(++i<=3)
        {
            System.out.println("****Enter the Chat-Room Details**** ");
            System.out.print("Enter Chat-Room ID : ");
            int roomID = sc.nextInt();
            System.out.print("Enter your user password : ");
            String password = sc.next();
            if(c.getRoomID() == roomID &&  password.equalsIgnoreCase(u.getUserPassword()))
            {
                u.setLoginStatus(true);
                break;
            }
        }
    }

   //Send Messages
    public void sendMessage(User u, ChatRoom c)
    {
        sc.nextLine();
        String newMessage = u.getUserName() + "  :  " + " ' ";
        System.out.print("Enter your messages/ Say Hii: ");
        newMessage += sc.nextLine() + " ' ";
        c.addMessages(newMessage);
    }

    public static void main(String[] args) {
        Main m = new Main();
        LinkedList<User> l = new LinkedList<>();
        User u = null;
        ChatRoom c = null;

        System.out.println("*********Welcome to the console based java Chat Application!!********* ");

        while(true)
        {
            System.out.println("\nMenu : ");
            System.out.println("A)Create a chat room ");
            System.out.println("B)Add the user ");
            System.out.println("C)User login ");
            System.out.println("D)Send a message ");
            System.out.println("E)Display the messages from a specific chat room ");
            System.out.println("F)List down all the users belonging to specified chat room");
            System.out.println("G)Logout ");
            System.out.println("H)Delete an user ");
            System.out.println("I)Delete the chat room ");
            System.out.print("\nEnter Your Choice : ");
            char ch = m.sc.next().charAt(0);
            switch(ch)
            {
                case 'A' :    if(c==null)
                              {
                                  c = m.createChatRoom();
                                  l = new LinkedList<>();
                                  System.out.println("\n ***** Chat Room Created!  *****");
                              }
                              else {
                                  System.out.println("Given chatroom already exists : " + c.getRoomName() + "\n Our system supports one chatroom per application at a time ");
                                  System.out.print("Do you still want to create your room(Y/N)? : ");
                                  String ans = m.sc.next();
                                  if(ans.equalsIgnoreCase("Y"))
                                  {
                                      c = m.createChatRoom();
                                      l = new LinkedList<>();                                     
                                      System.out.println("\n ***** Chat Room Created! *****");
                                  }
                                  else
                                      break;
                              }
                              break;

                case 'B' :    if(c!=null) {
                                l = m.addUser(l);
                                c.setAddUser(l);                               
                                System.out.println("\n**** User* Added! *****");
                                }
                              else
                                  System.out.println("Create the chatroom first ");
                              break;

                case 'C' :    System.out.println("Select your userID from the list of users id ");
                              l.forEach((k) -> {
                                  System.out.println("UserId : "+k.getUserID());
                              });
                              System.out.print("Enter your user Id : ");
                              int userID = m.sc.nextInt();
                              int choice = 0;
                              for(User k : l)
                                  if(userID == k.getUserID()) {
                                      m.userLogin(k, c);                                      
                                      System.out.println("\n***** Login Successful! *****");
                                      u = k;
                                      choice = 1;
                                      break;
                                  }
                              if(choice == 1)
                                  break;
                              System.out.println("This User doesn't exists!");
                              break;

                case 'D' :    if(u!=null && c!=null)
                              {
                                if(u.isLoginStatus())
                                {
                                    m.sendMessage(u,c);
                                }
                                else
                                    System.out.println("First, login into the Chat Room");
                              }
                              else
                              {
                                  System.out.println("Either the user or chatroom  doesn't exists");
                              }
                              break;

                case 'E' :   if(c!=null)
                                System.out.println(c.getMessages());
                              else
                                  System.out.println("Room doesn't exists!");
                              break;
                case 'F' :    if(c!=null)
                                l.forEach((k)->{System.out.println("User Id : "+k.getUserID()+" User Name : "+k.getUserName());});
                              else
                                System.out.println("Room doesn't exists!");
                              break;
                case 'G' :    if(u!=null)
                                {
                                    if(u.isLoginStatus())
                                        u.setLoginStatus(false);
                                    else
                                        System.out.println("Seesion is over. Please, login again.");
                                }
                                else
                                    System.out.println("Seesion is over. Please, login again.");
                                break;
                case 'H' :      System.out.print("Enter the user ID you want to delete : ");
                                int userId = m.sc.nextInt();
                                for(User k : l) {
                                if (userId == k.getUserID()) {
                                l.remove(k);
                                break;
                                }
                                }

                case 'I' :    c=null;
                              u=null;
                              l=new LinkedList<>();
                              break;


                default :   System.out.println("Please, enter the given choice.");
            }
        }


    }
}