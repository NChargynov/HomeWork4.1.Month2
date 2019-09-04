public class Runner extends Thread {

    @Override
    public void run() {
        try {
            Runner runner1 = new Runner();
            Runner runner2 = new Runner();
            runner1.setName("Runner 1");
            runner2.setName("Runner 2");
            System.out.println(runner1.getName() + " берет палочку");
            System.out.println(runner1.getName() + " бежит к " + runner2.getName());
            sleep(5000);
            runnable.run();
            join();

        } catch (Exception e) {

        }
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                Runner runner2 = new Runner();
                Runner runner3 = new Runner();
                runner2.setName("Runner 2");
                runner3.setName("Runner 3");
                System.out.println(runner2.getName() + " берет палочку");
                System.out.println(runner2.getName() + " бежит к " + runner3.getName());
                sleep(5000);
                runnable2.run();
                join();
            } catch (Exception e) {

            }
        }
    };

    Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            try {
                Runner runner3 = new Runner();
                Runner runner4 = new Runner();
                runner3.setName("Runner 3");
                runner4.setName("Runner 4");
                System.out.println(runner3.getName() + " берет палочку");
                System.out.println(runner3.getName() + " бежит к " + runner4.getName());
                sleep(5000);
                runnable3.run();
                join();
            } catch (Exception e) {

            }

        }
    };

    Runnable runnable3 = new Runnable() {
        @Override
        public void run() {
            try {
                Runner runner4 = new Runner();
                Runner runner5 = new Runner();
                runner4.setName("Runner 4");
                runner5.setName("Runner 5");
                System.out.println(runner4.getName() + " берет палочку");
                System.out.println(runner4.getName() + " бежит к " + runner5.getName());
                sleep(5000);
                runnable4.run();
                join();
            } catch (Exception e) {

            }

        }
    };

    Runnable runnable4 = new Runnable() {
        @Override
        public void run() {
            try {
                Runner runner4 = new Runner();
                Runner runner5 = new Runner();
                runner4.setName("Runner 4");
                runner5.setName("Runner 5");
                System.out.println(runner5.getName() + " бежит к финишу");
                System.out.println(runner5.getName() + " бежит к " + runner4.getName());
                sleep(5000);
                runnable5.run();
                join();
            } catch (Exception e) {

            }
        }
    };
    Runnable runnable5 = new Runnable() {
        @Override
        public void run() {
            try {
                Runner runner3 = new Runner();
                Runner runner4 = new Runner();
                runner3.setName("Runner 3");
                runner4.setName("Runner 4");
                System.out.println(runner4.getName() + " Берет палочку ");
                System.out.println(runner4.getName() + " Бежит к " + runner3.getName());
                sleep(5000);
                runnable6.run();
                join();
            }catch (Exception e){

            }

        }
    };

    Runnable runnable6 = new Runnable() {
        @Override
        public void run() {

            try {
                Runner runner2 = new Runner();
                Runner runner3 = new Runner();
                runner2.setName("Runner 2");
                runner3.setName("Runner 3");
                System.out.println(runner3.getName() + " берет палочку");
                System.out.println(runner3.getName() + " бежит к " + runner2.getName());
                sleep(5000);
                runnable7.run();
                join();
            } catch (Exception e) {

            }

        }
    };

    Runnable runnable7 = new Runnable() {
        @Override
        public void run() {
            try {
                Runner runner1 = new Runner();
                Runner runner2 = new Runner();
                runner1.setName("Runner 1");
                runner2.setName("Runner 2");
                System.out.println(runner2.getName() + " берет палочку");
                System.out.println(runner2.getName() + " бежит к " + runner1.getName());
                System.out.println(runner1.getName() + " берет палочку ");
                sleep(5000);

            } catch (Exception e) {

            }finally {
                System.out.println("The End");
            }
        }
    };

}
