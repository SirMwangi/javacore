package learning.javacore.itbulls.oop;

import java.math.BigDecimal;

public class Product {
            // the objects below have been encapsulated
            private String name;
        private BigDecimal price;

            // below is called a constructor
        public Product() {
        }

        public Product(String name, BigDecimal price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public BigDecimal getPrice() {
            return price;
        }
        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product [name=" + name + ", price=" + price + "]";
        }
}
