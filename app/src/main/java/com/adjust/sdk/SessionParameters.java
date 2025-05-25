package com.adjust.sdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SessionParameters {
    Map<String, String> callbackParameters;
    Map<String, String> partnerParameters;

    public SessionParameters deepCopy() {
        SessionParameters sessionParameters = new SessionParameters();
        if (this.callbackParameters != null) {
            sessionParameters.callbackParameters = new HashMap(this.callbackParameters);
        }
        if (this.partnerParameters != null) {
            sessionParameters.partnerParameters = new HashMap(this.partnerParameters);
        }
        return sessionParameters;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionParameters sessionParameters = (SessionParameters) obj;
        if (Util.equalObject(this.callbackParameters, sessionParameters.callbackParameters) && Util.equalObject(this.partnerParameters, sessionParameters.partnerParameters)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Util.hashObject(this.partnerParameters, Util.hashObject(this.callbackParameters, 17));
    }
}
