package Hometask1;

import Hometask1.Controller;

public class Main {

        public static void main(String[] args) {
            // Initialization
            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(model, view);
            // Run
            controller.processUser();
        }

    }

