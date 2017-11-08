package com.example.samuel.MinnWhist;

import android.view.View;

import edu.up.cs301.game.GameHumanPlayer;
import edu.up.cs301.game.GameMainActivity;
import edu.up.cs301.game.infoMsg.GameInfo;

/**
 * Created by PatrickMaloney on 11/7/17.
 */

public class WhistHumanPlayer extends GameHumanPlayer {

    public WhistHumanPlayer(String name){
        super(name);
    }

    public void setAsGui(GameMainActivity activity){

    }

    public void receiveInfo(GameInfo info){

    }

    public View getTopView(){

        return null;
    }
}
