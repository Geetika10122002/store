package com.example.store.entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message="The name is required")
    private String name;
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    @NotEmpty(message="The brand is required")
    private String brand;
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand=brand;
    }
    @NotEmpty(message="The category is required")
    private String category;
    public String getCategory(){
        return category;
    }
    public void setCategory(){
        this.category=category;
    }
    @Min(0)
    private double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    @Size(min=10,message="The description should be at least 10 characters")
    @Size(max=2000,message="The description cannot exceed 2000 characters")
    private String description;
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description=description;
    }
    private MultipartFile imageFieldName;
    public MultipartFile getImageFieldName(){
        return imageFieldName;
    }
    public void setImageFieldName(){
        this.imageFieldName=imageFieldName;
    }
}
