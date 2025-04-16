public class Circle{
  
    private double radius;
        
    public Circle (double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public double area() {
        return Math.pow(this.radius, 2)*3.14;
    }
    
    public double circumference() {
        return (this.radius*2)*3.14;
    }
}
