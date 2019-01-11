package com.senior.api.db.pojo;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cities")
public class City {


    @Id
    private ObjectId id;
    private int ibgeId;
    private String uf;
    private String name;
    private String capital;
    private double longitude;
    private double latitude;
    private String noaccents;
    private String alternativeNames;
    private String microregion;
    private String mesoregion;

}
