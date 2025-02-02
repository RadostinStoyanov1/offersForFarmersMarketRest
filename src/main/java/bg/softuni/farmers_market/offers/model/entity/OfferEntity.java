package bg.softuni.farmers_market.offers.model.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table(name = "offers")
public class OfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductTypeEnum productType;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "name", nullable = false)
    private String name;

    private Long author;
    @Column(name = "likes")
    private Long likes = 0l;

    public Long getId() {
        return id;
    }

    public OfferEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public ProductTypeEnum getProductType() {
        return productType;
    }

    public OfferEntity setProductType(ProductTypeEnum productType) {
        this.productType = productType;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public OfferEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Long getAuthor() {
        return author;
    }

    public OfferEntity setAuthor(Long author) {
        this.author = author;
        return this;
    }

    public Long getLikes() {
        return likes;
    }

    public OfferEntity setLikes(Long likes) {
        this.likes = likes;
        return this;
    }
}
