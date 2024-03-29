package com.posgrado.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue
  private UUID id;

  @Column(length = 70, nullable = false)
  private String name;

  private String description;
  private String imageUrl;
  private Double price;
  private Integer stock;
  private Boolean active;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;


}
