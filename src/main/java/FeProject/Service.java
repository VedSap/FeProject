package FeProject;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private DataRepository dataRepository;

    public List<DataEntity> getAllData(){
        List<DataEntity> dataEntities = new ArrayList<>();
        dataRepository.findAll().forEach(dataEntities::add);
        return dataEntities;
    }
}
