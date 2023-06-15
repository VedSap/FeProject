package FeProject;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private DataRepository dataRepository;

    public List<DataEntity> getAllData(){
        List<DataEntity> dataEntities = new ArrayList<>();
        dataRepository.findAll().forEach(dataEntities::add);
        return dataEntities;
    }

    public void addCrime(String payload){
        JSONObject jsonObject = new JSONObject(payload);
        DataEntity de = new DataEntity();
        de.setCrime(jsonObject.getString("crime"));
        de.setLatitude(jsonObject.getDouble("latitude"));
        de.setLongitude(jsonObject.getDouble("longitude"));
        de.setDate(jsonObject.getString("date"));
        de.setFirId(jsonObject.getString("firId"));
        de.setPoliceStationName(jsonObject.getString("policeStationName"));
        de.setPerpName(jsonObject.getString("perpName"));
        de.setSeverity(jsonObject.getInt("severity"));
        dataRepository.save(de);
    }

    public List<LatLong> getLatLong(){
        List<LatLong> latLongs = new ArrayList();
        List<DataEntity> dataEntities = getAllData();

        for (DataEntity dataEntity: dataEntities) {
            LatLong latLong = new LatLong();
            latLong.setLatitude(dataEntity.getLatitude());
            latLong.setLongitude(dataEntity.getLongitude());
            latLongs.add(latLong);
        }
        return latLongs;
    }
}
