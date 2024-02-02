// Incomplete Category implementation (no checks for incoming value)

public class Category {
    public Category(String value) {

    value = value.toLowerCase();

    if (value == null || value.isEmpty()) {
        throw new IllegalArgumentException("Category cannot be empty or null");  
    }
    if (value.length() > 50) {
        throw new IllegalArgumentException("Category is too long");
    }
    
    if (!value.equals(value.toLowerCase())) {
        throw new IllegalArgumentException("String is not all lowercase");
    }

    else    
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}


// // Incomplete Description implementation (no checks for incoming value)

// public class Description {
//     public Description(String value) {

//         if (value == null || value.isEmpty()) {
//             throw new IllegalArgumentException("Description cannot be empty or null");
//         }
//         if (value.length() > 500) {
//             throw new IllegalArgumentException("String is too long");
//         }
//         else
//             this.value = value;



//     }

//     private String value;

//     public String getValue() {
//         return value;
//     }
// }