//Structural pattern

//Bride pattern

// Abstraction

   interface Shape {

    void draw();

}

// Refined Abstraction

   class Circle implements Shape {

    private Color color;

    Circle (Color color) {

        this.color = color;

    }

    public void draw() {

        System.out.print("Drawing Circle in  ");
        color.fill();
    }

}

// Implementor
     interface Color {
    void fill();

    }
// Concrete Implementor

    class Red implements Color {

        public void fill() {
            System.out.println("Red");
        }

        }
