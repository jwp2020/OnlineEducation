package com.atguigu.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    /**
     * 上传头像
     * @param file
     * @return
     */
    String uploadFileAvatar(MultipartFile file);
}
