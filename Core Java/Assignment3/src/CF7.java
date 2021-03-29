import java.util.*;

class Parked_CarOwner_Details{
    String ownerName;
    String carModel;
    String carNO;
    String ownerAddress;

    Parked_CarOwner_Details(String ownerName,String carModel,String carNO,String ownerAddress){
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNO = carNO;
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNO() {
        return carNO;
    }

    public void setCarNO(String carNO) {
        this.carNO = carNO;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
}

class Parked_CarOwnerList{
    ArrayList<Parked_CarOwner_Details> list=new ArrayList<>();

    public void add_new_car(String ownerName, String carModel, String carNO, String ownerAddress) {
        list.add(new Parked_CarOwner_Details(ownerName, carModel, carNO, ownerAddress));
    }

    public void remove_car(String carNO) {
        for(Parked_CarOwner_Details c: list) {
            if(c.carNO.equals(carNO)){
                int index = list.indexOf(c);
                list.remove(index);
                System.out.println("Car removed successfully!!");
                break;
            }
        }
    }

    public void get_parked_car_location(String carNO) {
        for(Parked_CarOwner_Details c: list) {
            if(c.carNO.equals(carNO)) {
                int index= list.indexOf(c);
                System.out.println("Car is parked at location: "+index);
                break;
            }
            else {
                System.out.println("Car is not here");
            }
        }
    }
}



public class CF7 {
    public static void main(String[] args) {
        Parked_CarOwnerList list = new Parked_CarOwnerList();
        list.add_new_car("Aditi", "Mercedes", "MH12T3604", "Pune");
        list.add_new_car("Anusha", "Suzuki", "MH14T4004", "Mumbai");
        list.get_parked_car_location("MH12T3604");
        list.remove_car("MH14T4004");
    }
}