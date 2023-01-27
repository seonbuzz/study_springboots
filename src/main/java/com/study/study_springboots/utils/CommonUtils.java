package com.study.study_springboots.utils;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public String getUniqueSequence() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    // src/main/resources/static/files -> root directory + 상대 경로  = relativePath
    public String getRelativeToAbsolutePath(String relativePath){
        String relativePathWithSeparator = relativePath.replace("/",  File.separator);
        // separator = 이 경로를 운영체제에 맞는 경로로 자동으로 만들어주는 기능
        String absolutePath = new File(relativePathWithSeparator).getAbsolutePath() + File.separator;//폴더의 경로를 가져옴
        return absolutePath;
    }
}
