package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.c;
import android.support.v4.media.session.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaControllerCompatApi21.java */
/* loaded from: classes.dex */
public final class g<T extends f> extends MediaController.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final T f1773a;

    public g(c.a aVar) {
        this.f1773a = aVar;
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if ((audioAttributes.getFlags() & 1) != 1 && (audioAttributes.getFlags() & 4) != 4) {
            audioAttributes.getUsage();
        }
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        ((c.a) this.f1773a).f1771a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((c.a) this.f1773a).f1771a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((c.a) this.f1773a).f1771a.get() != null) {
            Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                obtain.recycle();
                MediaMetadataCompat.CREATOR.createFromParcel(obtain).getClass();
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        c cVar = ((c.a) this.f1773a).f1771a.get();
        if (cVar != null && cVar.f1770a == null && playbackState != null) {
            List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
            if (customActions != null) {
                ArrayList arrayList2 = new ArrayList(customActions.size());
                for (PlaybackState.CustomAction customAction2 : customActions) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        customAction = new PlaybackStateCompat.CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), customAction3.getExtras());
                        customAction.f1768e = customAction2;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), playbackState.getExtras());
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List<MediaSession.QueueItem> list) {
        MediaSessionCompat.QueueItem queueItem;
        if (((c.a) this.f1773a).f1771a.get() != null && list != null) {
            ArrayList arrayList = new ArrayList();
            for (MediaSession.QueueItem queueItem2 : list) {
                if (queueItem2 != null) {
                    MediaSession.QueueItem queueItem3 = queueItem2;
                    queueItem = new MediaSessionCompat.QueueItem(queueItem2, MediaDescriptionCompat.a(queueItem3.getDescription()), queueItem3.getQueueId());
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        ((c.a) this.f1773a).f1771a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        ((c.a) this.f1773a).f1771a.get();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((c.a) this.f1773a).f1771a.get();
    }
}
