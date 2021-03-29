package com.chatting;
import java.util.LinkedList;

public class ChatRoom {
	private int roomID;
    private String roomName;
    private String roomPassword;
    private LinkedList<User>  addUser;
    public String msg = " Owner : Welcome to the Chat Room!! ";


    public ChatRoom(int roomID, String roomName, String roomPassword, LinkedList<User> addUser) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomPassword = roomPassword;
        this.addUser = addUser;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPassword() {
        return roomPassword;
    }

    public void setRoomPassword(String roomPassword) {
        this.roomPassword = roomPassword;
    }

    public LinkedList<User> getAddUser() {
        return addUser;
    }

    public void setAddUser(LinkedList<User> addUser) {
        this.addUser = addUser;
    }

    public String getMessages() {
        return msg;
    }

    public void addMessages(String msg) {
        this.msg +="\n"+ msg;
    }

}
