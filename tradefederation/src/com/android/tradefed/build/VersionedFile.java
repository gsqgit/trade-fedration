/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.tradefed.build;

import java.io.File;

/**
 * Data structure representing a file that has an associated version.
 */
public class VersionedFile {
    private final File mFile;
    private final String mVersion;

    public VersionedFile(File file, String version) {
        mFile = file;
        mVersion = version;
    }

    public File getFile() {
        return mFile;
    }

    public String getVersion() {
        return mVersion;
    }

    @Override
    public String toString() {
        return String.format("%s:%s", mFile.getAbsolutePath(), mVersion);
    }
}
