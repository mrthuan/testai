package y1;

import android.database.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBUtil.java */
/* loaded from: classes.dex */
public final class b {
    public static void a(b2.a aVar) {
        ArrayList arrayList = new ArrayList();
        Cursor f10 = aVar.f("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (f10.moveToNext()) {
            try {
                arrayList.add(f10.getString(0));
            } catch (Throwable th2) {
                f10.close();
                throw th2;
            }
        }
        f10.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                aVar.c("DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static int b(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                channel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th2;
        }
    }
}
