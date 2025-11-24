package com.centreformation.model.state;

import com.centreformation.model.Session;

public class SessionAnnuleeState implements SessionState {

    @Override
    public void ouvrir(Session session) {
        // en général, on ne rouvre pas une session annulée
    }

    @Override
    public void cloturer(Session session) {
        // sans effet
    }

    @Override
    public void annuler(Session session) {
        // déjà annulée
    }
}
