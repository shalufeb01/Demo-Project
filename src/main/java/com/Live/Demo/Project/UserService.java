package com.Live.Demo.Project;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    private MongoTemplate mongoTemplate;

    @Autowired
   private UserModel userModel;

    public UserService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    public Collection<UserModel> saveJson(){

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<UserModel> arrayList = new ArrayList<UserModel>();
        try {
           //mapper.enable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

                UserModel[]  userModel1 = mapper.readValue(new File("C:\\Developer\\Demo-Project\\.idea\\dataJSON.txt"), UserModel[].class);

            System.out.println(userModel1[2].getDate());


                for (int i =0; i<userModel1.length; i++) {

                   /* JSONObject on = array.getJSONObject(i);

                    String userid = userModel1[i].getUserid();
                    System.out.println(userid);
                    String dealerid = on.getString("dealerid");
                    String masterid = on.getString("masterid");
                    String adminid= on.getString("adminid");
                    String sstid = on.getString("sstid");
                    Double sportid = on.getDouble("sportid");

                    String date = on.getString("date");
                    Double totalpnl = on.getDouble("totalpnl");
                    Double liability  = on.getDouble("liability ");
                    String marketid = on.getString("marketid ");
                    Double matchid= on.getDouble("matchid ");
                    String type = on.getString("type");

                    Double selection1 = on.getDouble("selection1");
                    Double selection2 = on.getDouble("selection2");
                    Double selection3 = on.getDouble("selection3 ");
                    Double selection4 = on.getDouble("selection4 ");

                    String adminpartnership = on.getString("adminpartnership ");
                    String masterpartnership = on.getString("masterpartnership ");
                    String dealerpartnership = on.getString("dealerpartnership ");
                    String sstpartnership = on.getString("sstpartnership ");

                    Double pnl1 = on.getDouble("pnl1 ");
                    Double pnl2= on.getDouble("pnl2 ");
                    Double pnl3 = on.getDouble("pnl3 ");
                    Double pnl4  = on.getDouble("pnl4 ");

                    Object createdon = on.getString("createdon ");
                    String matchname = on.getString("matchname ");
                    boolean isactive = on.getBoolean("isactive ");
                    Double netpnl = on.getDouble("netpnl ");

                    Double adminpnl = on.getDouble("adminpnl ");
                    Double dealerpnl = on.getDouble("dealerpnl ");
                    Double sstpnl = on.getDouble("sstpnl ");
                    Double masterpnl  = on.getDouble("masterpnl ");

                    Double adminfancypnl = on.getDouble("adminfancypnl ");
                    Double dealerfancypnl = on.getDouble("dealerfancypnl ");
                    Double sstfancypnl = on.getDouble("sstfancypnl");
                    Double masterfancypnl = on.getDouble("masterfancypnl");
                    Double userFancyPnl = on.getDouble("userFancyPnl");

                    Double adminlivepnl = on.getDouble("adminlivepnl");
                    Double dealerlivepnl = on.getDouble("dealerlivepnl");
                    Double sstlivepnl = on.getDouble("sstlivepnl");
                    Double masterlivepnl = on.getDouble("masterlivepnl");
                    Double userlivepnl = on.getDouble("userlivepnl");

                    Double usercommission = on.getDouble("usercommission");
                    Double dealercommission = on.getDouble("dealercommission");
                    Double sstcommission = on.getDouble("sstcommission");
                    Double mastercommission = on.getDouble("mastercommission");

                    Double userfancycommission = on.getDouble("userfancycommission");
                    Double dealerfancycommission = on.getDouble("dealerfancycommission");
                    Double sstfancycommission = on.getDouble("sstfancycommission");
                    Double masterfancycommission = on.getDouble("masterfancycommission");


                    String adminuserid = on.getString("adminuserid ");
                    String sstuserid = on.getString("sstuserid ");
                    String masteruserid = on.getString("masteruserid ");
                    String dealeruserid = on.getString("dealeruserid");

                    String resultName = on.getString("resultName ");
                    String resultTime = on.getString("resultTime ");
                    Object resultsetTime = on.getString("resultsetTime ");

                    String username = on.getString("username ");
                    String adminUsername = on.getString("adminUsername ");
                    String sstUsername  = on.getString("sstUsername ");
                    String masterUsername  = on.getString("masterUsername ");
                    String dealerUsername = on.getString("dealerUsername ");

                    String declared = on.getString("declared ");
                    String resultid = on.getString("resultid ");
                    boolean isSuspended = on.getBoolean("isSuspended ");
                    boolean isUserSettled = on.getBoolean("isUserSettled ");
                    boolean isDealerSettled = on.getBoolean("isDealerSettled ");
                    boolean isMasterSettled = on.getBoolean("isMasterSettled ");
                    boolean isSstSettled = on.getBoolean("isSstSettled ");

                    Double cheatBetBundle = on.getDouble("cheatBetBundle ");
                    Double betcount = on.getDouble("betcount ");*/

                    userModel.setUserid(userModel1[i].getUserid());
                    userModel.setDealerid(userModel1[i].getDealerid());
                    userModel.setSportid(userModel1[i].getSportid());
                    userModel.setMasterid(userModel1[i].getMasterid());
                    userModel.setMarketid(userModel1[i].getMarketid());
                    userModel.setAdminid(userModel1[i].getAdminid());
                    userModel.setSstid(userModel1[i].getSstid());
                    userModel.setMatchid(userModel1[i].getMatchid());
                    userModel.setResultid(userModel1[i].getResultid());

                    userModel.setBetcount(userModel1[i].getBetcount());
                    userModel.setType(userModel1[i].getType());

                    userModel.setDate(userModel1[i].getDate());
                    userModel.setLiability(userModel1[i].getLiability() );
                    userModel.setCreatedon(userModel1[i].getCreatedon());
                    userModel.setMatchname(userModel1[i].getMatchname());
                    userModel.setCheatBetBundle(userModel1[i].getCheatBetBundle());

                    userModel.setPnl1(userModel1[i].getPnl1());
                    userModel.setPnl2(userModel1[i].getPnl2());
                    userModel.setPnl3(userModel1[i].getPnl3());
                    userModel.setPnl4(userModel1[i].getPnl4());

                    userModel.setSelection1(userModel1[i].getSelection1());
                    userModel.setSelection2(userModel1[i].getSelection2());
                    userModel.setSelection3(userModel1[i].getSelection3());
                    userModel.setSelection4(userModel1[i].getSelection4());

                    userModel.setTotalpnl(userModel1[i].getTotalpnl());
                    userModel.setDealerpnl(userModel1[i].getDealerpnl());
                    userModel.setSstpnl(userModel1[i].getSstpnl());
                    userModel.setMasterpnl(userModel1[i].getMasterpnl());
                    userModel.setAdminpnl(userModel1[i].getAdminpnl());
                    userModel.setNetpnl(userModel1[i].getNetpnl());

                    userModel.setUsercommission(userModel1[i].getUsercommission());
                    userModel.setMastercommission(userModel1[i].getMastercommission());
                    userModel.setDealercommission(userModel1[i].getDealercommission());
                    userModel.setSstcommission(userModel1[i].getSstcommission());

                    userModel.setMasterpartnership(userModel1[i].getMasterpartnership());
                    userModel.setDealerpartnership(userModel1[i].getDealerpartnership());
                    userModel.setAdminpartnership(userModel1[i].getAdminpartnership());
                    userModel.setSstpartnership(userModel1[i].getSstpartnership());

                    userModel.setResultName(userModel1[i].getResultName());
                    userModel.setResultsetTime(userModel1[i].getResultsetTime());
                    userModel.setResultTime(userModel1[i].getResultTime());

                    userModel.setDealerfancycommission(userModel1[i].getDealerfancycommission());
                    userModel.setUserfancycommission(userModel1[i].getUserfancycommission());
                    userModel.setMasterfancycommission(userModel1[i].getMasterfancycommission());
                    userModel.setSstfancycommission(userModel1[i].getSstfancycommission());

                    userModel.setDealerfancypnl(userModel1[i].getDealerfancypnl());
                    userModel.setMasterfancypnl(userModel1[i].getMasterfancypnl());
                    userModel.setSstfancypnl(userModel1[i].getSstfancypnl());
                    userModel.setAdminfancypnl(userModel1[i].getAdminfancypnl());
                    userModel.setUserFancyPnl(userModel1[i].getUserFancyPnl());

                    userModel.setMasterSettled(userModel1[i].getMasterSettled());
                    userModel.setDealerSettled(userModel1[i].getDealerSettled());
                    userModel.setUserSettled(userModel1[i].getUserSettled());
                    userModel.setSstSettled(userModel1[i].getSstSettled());

                    userModel.setUsername(userModel1[i].getUsername());
                    userModel.setAdminUsername(userModel1[i].getAdminUsername());
                    userModel.setDealerUsername(userModel1[i].getDealerUsername());
                    userModel.setSstUsername(userModel1[i].getSstUsername());
                    userModel.setMasterUsername(userModel1[i].getMasterUsername());

                    userModel.setSstuserid(userModel1[i].getSstuserid());
                    userModel.setDealeruserid(userModel1[i].getDealeruserid());
                    userModel.setMasteruserid(userModel1[i].getMasteruserid());
                    userModel.setAdminuserid(userModel1[i].getAdminuserid());

                    userModel.setSstlivepnl(userModel1[i].getSstlivepnl());
                    userModel.setAdminlivepnl(userModel1[i].getAdminlivepnl());
                    userModel.setMasterlivepnl(userModel1[i].getMasterlivepnl());
                    userModel.setDealerlivepnl(userModel1[i].getDealerlivepnl());
                    userModel.setUserlivepnl(userModel1[i].getUserlivepnl());

                    userModel.setDeclared(userModel1[i].getDeclared());
                    userModel.setSuspended(userModel1[i].getSuspended());
                    userModel.setIsactive(userModel1[i].getIsactive());

                   arrayList.add(userModel1[i]);



                }




        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mongoTemplate.insertAll(arrayList);

    }

    public List<UserModel> getData(String id){
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.find(query,UserModel.class);

    }

    public List<UserModel> getIsActiveStatus(Boolean activeStatus){

        Query query = new Query();
        query.addCriteria(Criteria.where("isactive").is(activeStatus))
                .addCriteria(Criteria.where("userid").not());
        return mongoTemplate.find(query,UserModel.class);

    }





}