package lib.zj.office.fc.hwpf.model;

import androidx.activity.f;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class SavedByEntry {
    private String saveLocation;
    private String userName;

    public SavedByEntry(String str, String str2) {
        this.userName = str;
        this.saveLocation = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavedByEntry)) {
            return false;
        }
        SavedByEntry savedByEntry = (SavedByEntry) obj;
        if (savedByEntry.userName.equals(this.userName) && savedByEntry.saveLocation.equals(this.saveLocation)) {
            return true;
        }
        return false;
    }

    public String getSaveLocation() {
        return this.saveLocation;
    }

    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return this.saveLocation.hashCode() + f.h(this.userName, 377, 13);
    }

    public String toString() {
        return "SavedByEntry[userName=" + getUserName() + ",saveLocation=" + getSaveLocation() + "]";
    }
}
