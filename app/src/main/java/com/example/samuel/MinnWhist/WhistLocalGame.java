package com.example.samuel.MinnWhist;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;

/**
 * Created by PatrickMaloney on 11/7/17.
 */

public class WhistLocalGame extends LocalGame {

    @Override
    protected boolean canMove(int playerIdx){
        return false;
    }

    @Override
    protected String checkIfGameOver(){
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action){
        return false;
    }

    @Override
    protected void sendUpdatedStateTo(GamePlayer p){

    }
}
