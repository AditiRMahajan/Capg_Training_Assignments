package com.springrest.ZipServices;

import java.util.*;

import com.springrest.Zip.ZipCodes;

import org.springframework.stereotype.Service;

@Service
public class zipServicesImpl implements zipServices{

    List<ZipCodes> list;

    public zipServicesImpl() {
        list = new ArrayList<ZipCodes>();
        list.add(new ZipCodes("1","Maharashtra","Pune","India"));
        list.add(new ZipCodes("2","MP","Bhopal","India"));
    }

    public ZipCodes getByZipCodes(String id) {
        ZipCodes c=null;
        for(ZipCodes z:list){
            if(z.getZipCodes().equals(id)){
                c=z;
                break;
            }
        }
        return c;
    }
}