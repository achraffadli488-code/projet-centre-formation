package com.centreformation.model.state;

import com.centreformation.model.Session;

public interface SessionState {
    void ouvrir(Session session);
    void cloturer(Session session);
    void annuler(Session session);
}
