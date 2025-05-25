package lib.zj.office.fc.poifs.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import lib.zj.office.fc.util.IOUtils;

/* loaded from: classes3.dex */
public class FileBackedDataSource extends DataSource {
    private FileChannel channel;

    public FileBackedDataSource(File file) {
        if (file.exists()) {
            this.channel = new RandomAccessFile(file, "r").getChannel();
            return;
        }
        throw new FileNotFoundException(file.toString());
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public void close() {
        this.channel.close();
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public void copyTo(OutputStream outputStream) {
        WritableByteChannel newChannel = Channels.newChannel(outputStream);
        FileChannel fileChannel = this.channel;
        fileChannel.transferTo(0L, fileChannel.size(), newChannel);
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public ByteBuffer read(int i10, long j10) {
        if (j10 < size()) {
            this.channel.position(j10);
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            if (IOUtils.readFully(this.channel, allocate) != -1) {
                allocate.position(0);
                return allocate;
            }
            throw new IllegalArgumentException("Position " + j10 + " past the end of the file");
        }
        throw new IllegalArgumentException("Position " + j10 + " past the end of the file");
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public long size() {
        return this.channel.size();
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public void write(ByteBuffer byteBuffer, long j10) {
        this.channel.write(byteBuffer, j10);
    }

    public FileBackedDataSource(FileChannel fileChannel) {
        this.channel = fileChannel;
    }
}
