/*
 * TagID3.java
 *
 * Created on 16-Jul-2008
 *
 * Copyright (C)2008 CARTI Systems
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package com.cartiec.jrenamer.tags;

import java.io.File;
import org.blinkenlights.jid3.ID3Exception;
import org.blinkenlights.jid3.MP3File;
import org.blinkenlights.jid3.MediaFile;
import org.blinkenlights.jid3.v1.ID3V1_0Tag;
import org.blinkenlights.jid3.v2.ID3V2_3_0Tag;

/**
 *
 * @author Tonny
 */
public class TagID3 {
    private ID3V1_0Tag id3v1_0Tag;
    private ID3V2_3_0Tag id3v2_3_0Tag;
    private File file = new File("");

    public void readTags(File file) {
        this.file = file;
        MediaFile mediaFile = new MP3File(file);
        try {
            for (Object obj : mediaFile.getTags()) {
                if (obj instanceof ID3V1_0Tag) {
                    id3v1_0Tag = (ID3V1_0Tag) obj;
                    
                } else if (obj instanceof ID3V2_3_0Tag) {
                    id3v2_3_0Tag = (ID3V2_3_0Tag) obj;
                    
                }
            }
        } catch (ID3Exception e1) {
            e1.printStackTrace();
        }
    }

    public ID3V1_0Tag getId3v1_0Tag() {
        return id3v1_0Tag;
    }

    public void setId3v1_0Tag(ID3V1_0Tag id3v1_0Tag) {
        this.id3v1_0Tag = id3v1_0Tag;
    }

    public ID3V2_3_0Tag getId3v2_3_0Tag() {
        return id3v2_3_0Tag;
    }

    public void setId3v2_3_0Tag(ID3V2_3_0Tag id3v2_3_0Tag) {
        this.id3v2_3_0Tag = id3v2_3_0Tag;
    }

    public File getFile() {
        return file;
    }
    
    
}
