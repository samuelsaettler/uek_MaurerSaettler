package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.user.User;

import javax.persistence.*;

@Entity
@Table(name = "auction")
public class Auction {



        @Id

        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private int id;

        @Column(nullable = false)
        private String description;


        @Column(nullable = false)
        private float fixed_price;

        @Column(nullable = false)
        private float starting_price;

        @Column(nullable = false)
        private boolean is_public;

        @OneToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "article_id")
        private Article article;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "user_id")
        private User user;

        public Auction() {}

        public int getId() {
            return id;
        }

        public Auction setId(int id) {
            this.id = id;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public Auction setDescription(String description) {
            this.description = description;
            return this;
        }

         public float getFixed_price() {
        return fixed_price;
        }

        public void setFixed_price(float fixed_price) {
        this.fixed_price = fixed_price;
        }

        public float getStarting_price() {
        return starting_price;
        }

        public void setStarting_price(float starting_price) {
        this.starting_price = starting_price;
        }

        public boolean isIs_public() {
        return is_public;
        }

        public void setIs_public(boolean is_public) {
        this.is_public = is_public;
        }


}
