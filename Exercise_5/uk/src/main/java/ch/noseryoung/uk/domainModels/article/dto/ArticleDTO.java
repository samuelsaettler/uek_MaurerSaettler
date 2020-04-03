package ch.noseryoung.uk.domainModels.article.dto;


public class ArticleDTO {

    private String id;

    private String name;

    private String description;

    private int value;

    public ArticleDTO() {}

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArticleDTO setId(String id) {
        this.id = id;
        return this;
    }

    public ArticleDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ArticleDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getValue() {
        return value;
    }

    public ArticleDTO setValue(int value) {
        this.value = value;
        return this;
    }
}

