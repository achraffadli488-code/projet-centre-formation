package com.centreformation.model.state;

import com.centreformation.model.Session;

public class SessionTermineeState implements SessionState {

    @Override
    public void ouvrir(Session session) {
        // impossible de rouvrir
    }

    @Override
    public void cloturer(Session session) {
        // déjà terminée
    }

    @Override
    public void annuler(Session session) {
        // en principe, on ne peut plus annuler une session terminée
    }
}
