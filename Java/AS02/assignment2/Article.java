package assignment2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Article {
    Long id;
    String baseUrl;
    String title;
    String description;
    String content;
    String thumbnail;
    LocalDate createdAt;
    LocalDate updatedAt;
    LocalDate deletedAt;
    int status; // 1. Active | 0. Pending | -1. Deleted

    public Article(Long id, String baseUrl, String title, String description, String content, String thumbnail, LocalDate createdAt, LocalDate updatedAt, LocalDate deletedAt, int status) {
        this.id = id;
        this.baseUrl = baseUrl;
        this.title = title;
        this.description = description;
        this.content = content;
        this.thumbnail = thumbnail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.status = status;
    }

    public Article() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDate deletedAt) {
        this.deletedAt = deletedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
