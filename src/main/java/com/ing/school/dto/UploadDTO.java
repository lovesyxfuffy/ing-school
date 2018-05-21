package com.ing.school.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UploadDTO {
    private String name;
    private String originalName;
    private Long size;
    private String state;
    private String type;
    private String url;
    private String data;

    public UploadDTO(MultipartFile file, String id, String state) {
        this.name = file.getName();
        this.originalName = file.getOriginalFilename();
        this.size = file.getSize();
        this.type = ".jpg";
        this.url = id;
        this.state = state;
        this.data = this.url;
    }
}
