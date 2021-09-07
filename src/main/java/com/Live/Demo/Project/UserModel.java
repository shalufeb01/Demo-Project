package com.Live.Demo.Project;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties
@Component
@Document(collection = "userModel")
public class UserModel {


    @Indexed
    private String id;

    @Id
    @Indexed
    private String userid;

    @Indexed
    @JsonIgnore
    private String dealerid;

    @Indexed
    private String masterid;

    @Indexed
    private String adminid;
    @Indexed
    private String sstid;

    @Indexed
    private Double sportid;

    @Indexed
    private String date;
    private Double totalpnl;
    private Double liability;
    @Indexed
    private String marketid;

    @Indexed
    private Double matchid;

    @Indexed
    private String type;

    private Double selection1;
    private Double selection2;
    private Double selection3;
    private Double selection4;

    private String adminpartnership;
    private String masterpartnership;
    private String dealerpartnership;
    private String sstpartnership;

    private Double pnl1;
    private Double pnl2;
    private Double pnl3;
    private Double pnl4;
    @Indexed
    private Object createdon;

    private String matchname;

    @Indexed
    private Boolean isactive;
    private Double netpnl;
    private Double adminpnl;
    private Double dealerpnl;
    private Double sstpnl;
    private Double masterpnl;

    private Double adminfancypnl;
    private Double dealerfancypnl;
    private Double sstfancypnl;
    private Double masterfancypnl;
    private Double userFancyPnl;


    private Double adminlivepnl;
    private Double dealerlivepnl;
    private Double sstlivepnl;
    private Double masterlivepnl;
    private Double userlivepnl;

    private Double usercommission;
    private Double dealercommission;
    private Double sstcommission;
    private Double mastercommission;

    private Double userfancycommission;
    private Double dealerfancycommission;
    private Double sstfancycommission;
    private Double masterfancycommission;

    private Double betcount;
    private Double cheatBetBundle;

    private String adminuserid;
    private String sstuserid;
    private String masteruserid;
    private String dealeruserid;

    @JsonIgnore
    private Boolean isSstSettled;
    private Boolean isMasterSettled;
    private Boolean isDealerSettled;
    private Boolean isUserSettled;

    private String resultName;
    private String resultTime;
    @Indexed
    private Object resultsetTime;
    @Indexed
    private String resultid;


    private String username;
    private String adminUsername;
    private String sstUsername;
    private String masterUsername;
    private String dealerUsername;

    private String declared;

    @Indexed
    private Boolean isSuspended;

   public UserModel(){

    }

    public UserModel(String id, String userid, String dealerid, String masterid,
                     String adminid, String sstid, Double sportid, String date,
                     Double totalpnl, Double liability, String marketid, Double matchid,
                     String type, Double selection1, Double selection2, Double selection3,
                     Double selection4, String adminpartnership, String masterpartnership,
                     String dealerpartnership, String sstpartnership, Double pnl1, Double pnl2,
                     Double pnl3, Double pnl4, Object createdon, String matchname, Boolean isactive,
                     Double netpnl, Double adminpnl, Double dealerpnl, Double sstpnl, Double masterpnl,
                     Double adminfancypnl, Double dealerfancypnl, Double sstfancypnl, Double masterfancypnl,
                     Double userFancyPnl, Double adminlivepnl, Double dealerlivepnl, Double sstlivepnl,
                     Double masterlivepnl, Double userlivepnl, Double usercommission, Double dealercommission,
                     Double sstcommission, Double mastercommission, Double userfancycommission,
                     Double dealerfancycommission, Double sstfancycommission, Double masterfancycommission,
                     Double betcount, Double cheatBetBundle, String adminuserid, String sstuserid,
                     String masteruserid, String dealeruserid, Boolean isSstSettled,
                     Boolean isMasterSettled, Boolean isDealerSettled, Boolean isUserSettled,
                     String resultName, String resultTime, Object resultsetTime, String resultid,
                     String username, String adminUsername, String sstUsername, String masterUsername,
                     String dealerUsername, String declared, Boolean isSuspended) {
        this.id = id;
        this.userid = userid;
        this.dealerid = dealerid;
        this.masterid = masterid;
        this.adminid = adminid;
        this.sstid = sstid;
        this.sportid = sportid;
        this.date = date;
        this.totalpnl = totalpnl;
        this.liability = liability;
        this.marketid = marketid;
        this.matchid = matchid;
        this.type = type;
        this.selection1 = selection1;
        this.selection2 = selection2;
        this.selection3 = selection3;
        this.selection4 = selection4;
        this.adminpartnership = adminpartnership;
        this.masterpartnership = masterpartnership;
        this.dealerpartnership = dealerpartnership;
        this.sstpartnership = sstpartnership;
        this.pnl1 = pnl1;
        this.pnl2 = pnl2;
        this.pnl3 = pnl3;
        this.pnl4 = pnl4;
        this.createdon = createdon;
        this.matchname = matchname;
        this.isactive = isactive;
        this.netpnl = netpnl;
        this.adminpnl = adminpnl;
        this.dealerpnl = dealerpnl;
        this.sstpnl = sstpnl;
        this.masterpnl = masterpnl;
        this.adminfancypnl = adminfancypnl;
        this.dealerfancypnl = dealerfancypnl;
        this.sstfancypnl = sstfancypnl;
        this.masterfancypnl = masterfancypnl;
        this.userFancyPnl = userFancyPnl;
        this.adminlivepnl = adminlivepnl;
        this.dealerlivepnl = dealerlivepnl;
        this.sstlivepnl = sstlivepnl;
        this.masterlivepnl = masterlivepnl;
        this.userlivepnl = userlivepnl;
        this.usercommission = usercommission;
        this.dealercommission = dealercommission;
        this.sstcommission = sstcommission;
        this.mastercommission = mastercommission;
        this.userfancycommission = userfancycommission;
        this.dealerfancycommission = dealerfancycommission;
        this.sstfancycommission = sstfancycommission;
        this.masterfancycommission = masterfancycommission;
        this.betcount = betcount;
        this.cheatBetBundle = cheatBetBundle;
        this.adminuserid = adminuserid;
        this.sstuserid = sstuserid;
        this.masteruserid = masteruserid;
        this.dealeruserid = dealeruserid;
        this.isSstSettled = isSstSettled;
        this.isMasterSettled = isMasterSettled;
        this.isDealerSettled = isDealerSettled;
        this.isUserSettled = isUserSettled;
        this.resultName = resultName;
        this.resultTime = resultTime;
        this.resultsetTime = resultsetTime;
        this.resultid = resultid;
        this.username = username;
        this.adminUsername = adminUsername;
        this.sstUsername = sstUsername;
        this.masterUsername = masterUsername;
        this.dealerUsername = dealerUsername;
        this.declared = declared;
        this.isSuspended = isSuspended;
    }

    public UserModel(Double totalpnl) {
        this.totalpnl = totalpnl;
    }

    public UserModel(String id, String userid, String dealerid, String masterid, String adminid, String sstid, Double sportid, String marketid, Double matchid, String resultid, String adminpartnership, String masterpartnership, String dealerpartnership, String sstpartnership, Double selection1, Double selection2, Double selection3, Double selection4, String date, String declared, Double betcount, Double cheatBetBundle, Double pnl1, Double pnl2, Double pnl3, Double pnl4, String matchname, Boolean isactive, Double netpnl, Double adminpnl, Double dealerpnl, Double sstpnl, Double masterpnl, Boolean suspended, Double dealerfancypnl, Double sstfancypnl, Double masterfancypnl, Double userFancyPnl, Double adminfancypnl, Double dealerlivepnl, Double sstlivepnl, Double masterlivepnl, Double userlivepnl, Double adminlivepnl, Double dealercommission, Double sstcommission, Double mastercommission, Double usercommission, Double dealerfancycommission, Double sstfancycommission, Double masterfancycommission, Double userfancycommission, Boolean userSettled, Boolean masterSettled, Boolean dealerSettled, Boolean sstSettled, String adminuserid, String dealeruserid, String masteruserid, String sstuserid, String adminUsername, String username, String dealerUsername, String masterUsername, String sstUsername, String resultName, String resultTime, Object resultsetTime) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDealerid() {
        return dealerid;
    }

    public void setDealerid(String dealerid) {
        this.dealerid = dealerid;
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getSstid() {
        return sstid;
    }

    public void setSstid(String sstid) {
        this.sstid = sstid;
    }

    public Double getSportid() {
        return sportid;
    }

    public void setSportid(Double sportid) {
        this.sportid = sportid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTotalpnl() {
        return totalpnl;
    }

    public void setTotalpnl(Double totalpnl) {
        this.totalpnl = totalpnl;
    }

    public Double getLiability() {
        return liability;
    }

    public void setLiability(Double liability) {
        this.liability = liability;
    }

    public String getMarketid() {
        return marketid;
    }

    public void setMarketid(String marketid) {
        this.marketid = marketid;
    }

    public Double getMatchid() {
        return matchid;
    }

    public void setMatchid(Double matchid) {
        this.matchid = matchid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSelection1() {
        return selection1;
    }

    public void setSelection1(Double selection1) {
        this.selection1 = selection1;
    }

    public Double getSelection2() {
        return selection2;
    }

    public void setSelection2(Double selection2) {
        this.selection2 = selection2;
    }

    public Double getSelection3() {
        return selection3;
    }

    public void setSelection3(Double selection3) {
        this.selection3 = selection3;
    }

    public Double getSelection4() {
        return selection4;
    }

    public void setSelection4(Double selection4) {
        this.selection4 = selection4;
    }

    public String getAdminpartnership() {
        return adminpartnership;
    }

    public void setAdminpartnership(String adminpartnership) {
        this.adminpartnership = adminpartnership;
    }

    public String getMasterpartnership() {
        return masterpartnership;
    }

    public void setMasterpartnership(String masterpartnership) {
        this.masterpartnership = masterpartnership;
    }

    public String getDealerpartnership() {
        return dealerpartnership;
    }

    public void setDealerpartnership(String dealerpartnership) {
        this.dealerpartnership = dealerpartnership;
    }

    public String getSstpartnership() {
        return sstpartnership;
    }

    public void setSstpartnership(String sstpartnership) {
        this.sstpartnership = sstpartnership;
    }

    public Double getPnl1() {
        return pnl1;
    }

    public void setPnl1(Double pnl1) {
        this.pnl1 = pnl1;
    }

    public Double getPnl2() {
        return pnl2;
    }

    public void setPnl2(Double pnl2) {
        this.pnl2 = pnl2;
    }

    public Double getPnl3() {
        return pnl3;
    }

    public void setPnl3(Double pnl3) {
        this.pnl3 = pnl3;
    }

    public Double getPnl4() {
        return pnl4;
    }

    public void setPnl4(Double pnl4) {
        this.pnl4 = pnl4;
    }

    public Object getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Object createdon) {
        this.createdon = createdon;
    }

    public String getMatchname() {
        return matchname;
    }

    public void setMatchname(String matchname) {
        this.matchname = matchname;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Double getNetpnl() {
        return netpnl;
    }

    public void setNetpnl(Double netpnl) {
        this.netpnl = netpnl;
    }

    public Double getAdminpnl() {
        return adminpnl;
    }

    public void setAdminpnl(Double adminpnl) {
        this.adminpnl = adminpnl;
    }

    public Double getDealerpnl() {
        return dealerpnl;
    }

    public void setDealerpnl(Double dealerpnl) {
        this.dealerpnl = dealerpnl;
    }

    public Double getSstpnl() {
        return sstpnl;
    }

    public void setSstpnl(Double sstpnl) {
        this.sstpnl = sstpnl;
    }

    public Double getMasterpnl() {
        return masterpnl;
    }

    public void setMasterpnl(Double masterpnl) {
        this.masterpnl = masterpnl;
    }

    public Double getAdminfancypnl() {
        return adminfancypnl;
    }

    public void setAdminfancypnl(Double adminfancypnl) {
        this.adminfancypnl = adminfancypnl;
    }

    public Double getDealerfancypnl() {
        return dealerfancypnl;
    }

    public void setDealerfancypnl(Double dealerfancypnl) {
        this.dealerfancypnl = dealerfancypnl;
    }

    public Double getSstfancypnl() {
        return sstfancypnl;
    }

    public void setSstfancypnl(Double sstfancypnl) {
        this.sstfancypnl = sstfancypnl;
    }

    public Double getMasterfancypnl() {
        return masterfancypnl;
    }

    public void setMasterfancypnl(Double masterfancypnl) {
        this.masterfancypnl = masterfancypnl;
    }

    public Double getUserFancyPnl() {
        return userFancyPnl;
    }

    public void setUserFancyPnl(Double userFancyPnl) {
        this.userFancyPnl = userFancyPnl;
    }

    public Double getAdminlivepnl() {
        return adminlivepnl;
    }

    public void setAdminlivepnl(Double adminlivepnl) {
        this.adminlivepnl = adminlivepnl;
    }

    public Double getDealerlivepnl() {
        return dealerlivepnl;
    }

    public void setDealerlivepnl(Double dealerlivepnl) {
        this.dealerlivepnl = dealerlivepnl;
    }

    public Double getSstlivepnl() {
        return sstlivepnl;
    }

    public void setSstlivepnl(Double sstlivepnl) {
        this.sstlivepnl = sstlivepnl;
    }

    public Double getMasterlivepnl() {
        return masterlivepnl;
    }

    public void setMasterlivepnl(Double masterlivepnl) {
        this.masterlivepnl = masterlivepnl;
    }

    public Double getUserlivepnl() {
        return userlivepnl;
    }

    public void setUserlivepnl(Double userlivepnl) {
        this.userlivepnl = userlivepnl;
    }

    public Double getUsercommission() {
        return usercommission;
    }

    public void setUsercommission(Double usercommission) {
        this.usercommission = usercommission;
    }

    public Double getDealercommission() {
        return dealercommission;
    }

    public void setDealercommission(Double dealercommission) {
        this.dealercommission = dealercommission;
    }

    public Double getSstcommission() {
        return sstcommission;
    }

    public void setSstcommission(Double sstcommission) {
        this.sstcommission = sstcommission;
    }

    public Double getMastercommission() {
        return mastercommission;
    }

    public void setMastercommission(Double mastercommission) {
        this.mastercommission = mastercommission;
    }

    public Double getUserfancycommission() {
        return userfancycommission;
    }

    public void setUserfancycommission(Double userfancycommission) {
        this.userfancycommission = userfancycommission;
    }

    public Double getDealerfancycommission() {
        return dealerfancycommission;
    }

    public void setDealerfancycommission(Double dealerfancycommission) {
        this.dealerfancycommission = dealerfancycommission;
    }

    public Double getSstfancycommission() {
        return sstfancycommission;
    }

    public void setSstfancycommission(Double sstfancycommission) {
        this.sstfancycommission = sstfancycommission;
    }

    public Double getMasterfancycommission() {
        return masterfancycommission;
    }

    public void setMasterfancycommission(Double masterfancycommission) {
        this.masterfancycommission = masterfancycommission;
    }

    public Double getBetcount() {
        return betcount;
    }

    public void setBetcount(Double betcount) {
        this.betcount = betcount;
    }

    public Double getCheatBetBundle() {
        return cheatBetBundle;
    }

    public void setCheatBetBundle(Double cheatBetBundle) {
        this.cheatBetBundle = cheatBetBundle;
    }

    public String getAdminuserid() {
        return adminuserid;
    }

    public void setAdminuserid(String adminuserid) {
        this.adminuserid = adminuserid;
    }

    public String getSstuserid() {
        return sstuserid;
    }

    public void setSstuserid(String sstuserid) {
        this.sstuserid = sstuserid;
    }

    public String getMasteruserid() {
        return masteruserid;
    }

    public void setMasteruserid(String masteruserid) {
        this.masteruserid = masteruserid;
    }

    public String getDealeruserid() {
        return dealeruserid;
    }

    public void setDealeruserid(String dealeruserid) {
        this.dealeruserid = dealeruserid;
    }

    public Boolean getSstSettled() {
        return isSstSettled;
    }

    public void setSstSettled(Boolean sstSettled) {
        isSstSettled = sstSettled;
    }

    public Boolean getMasterSettled() {
        return isMasterSettled;
    }

    public void setMasterSettled(Boolean masterSettled) {
        isMasterSettled = masterSettled;
    }

    public Boolean getDealerSettled() {
        return isDealerSettled;
    }

    public void setDealerSettled(Boolean dealerSettled) {
        isDealerSettled = dealerSettled;
    }

    public Boolean getUserSettled() {
        return isUserSettled;
    }

    public void setUserSettled(Boolean userSettled) {
        isUserSettled = userSettled;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getResultTime() {
        return resultTime;
    }

    public void setResultTime(String resultTime) {
        this.resultTime = resultTime;
    }

    public Object getResultsetTime() {
        return resultsetTime;
    }

    public void setResultsetTime(Object resultsetTime) {
        this.resultsetTime = resultsetTime;
    }

    public String getResultid() {
        return resultid;
    }

    public void setResultid(String resultid) {
        this.resultid = resultid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getSstUsername() {
        return sstUsername;
    }

    public void setSstUsername(String sstUsername) {
        this.sstUsername = sstUsername;
    }

    public String getMasterUsername() {
        return masterUsername;
    }

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    public String getDealerUsername() {
        return dealerUsername;
    }

    public void setDealerUsername(String dealerUsername) {
        this.dealerUsername = dealerUsername;
    }

    public String getDeclared() {
        return declared;
    }

    public void setDeclared(String declared) {
        this.declared = declared;
    }

    public Boolean getSuspended() {
        return isSuspended;
    }

    public void setSuspended(Boolean suspended) {
        isSuspended = suspended;
    }
}