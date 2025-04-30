package me.dio.muslim.domain.model;

public class Hadith {
    private String icon;
    private String description;

    // Construtores, getters e setters
  
    
        public Hadith(String icon, String description) {
            this.icon = icon;
            this.description = description;
        }
    
        public String getIcon() {
            return icon;
        }
    
        public void setIcon(String icon) {
            this.icon = icon;
        }
    
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    }
