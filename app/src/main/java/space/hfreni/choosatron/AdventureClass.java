package space.hfreni.choosatron;

/**
 * Created by hfreni on 30/09/2015.
 */
public class AdventureClass {

    // The Declarations and Stuff
    public String   sNameOfAdv;
    public String   sStoryBody;
    public int      iNumberOfChoices;
    public boolean  bIsPlayerDead;

    //Default Constructor
    public AdventureClass() {

    }

    // Constructor, cuz u gotta construct that shit.
    // TFW I could Have used this.
    public AdventureClass(String adventureName, String story, int iNumOfChoices) {
        sNameOfAdv = adventureName;
        sStoryBody = story;
        iNumberOfChoices = iNumOfChoices;
    }

    public String getsNameOfAdv() {
        return sNameOfAdv;
    }

    public void setsNameOfAdv(String sNameOfAdv) {
        this.sNameOfAdv = sNameOfAdv;
    }

    public String getsStoryBody() {
        return sStoryBody;
    }

    public void setsStoryBody(String sStoryBody) {
        this.sStoryBody = sStoryBody;
    }

    public int getiNumberOfChoices() {
        return iNumberOfChoices;
    }

    public void setiNumberOfChoices(int iNumberOfChoices) {
        this.iNumberOfChoices = iNumberOfChoices;
    }

    public boolean isPlayerDead() {
        return bIsPlayerDead;
    }

    public void setPlayerDead(boolean bIsPlayerDead) {
        this.bIsPlayerDead = bIsPlayerDead;
    }
}
