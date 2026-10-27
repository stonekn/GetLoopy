void main() {
    // Task 1
    for (int countUp = 0; countUp <= 30; countUp++) {
        System.out.print(countUp + " ");
    }

    System.out.println();

    // Task 2
    for (int countDown = 30; countDown >= 0; countDown--) {
        System.out.print(countDown + " ");
    }

    System.out.println();
    //Task 3
    for (int countByThree = 0; countByThree <= 18; countByThree += 3) {
        System.out.print(countByThree + " ");
    }
    System.out.println();
    // Task 4
    for (int countDownByTwo = 10; countDownByTwo >= 0; countDownByTwo -= 2) {
        System.out.print(countDownByTwo + " ");
    }
    System.out.println();
    // Task 5
    for (int rowNumber = 1; rowNumber <= 5; rowNumber++) {
        for (int starNumber = 1; starNumber <= rowNumber; starNumber++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println();
    // Task 6
    for (int rowNumber = 5; rowNumber >= 1; rowNumber--) {
        for (int starNumber = 1; starNumber <= rowNumber; starNumber++) {
            System.out.print("* ");
        }
        System.out.println();

    }
    System.out.println();
    // Task 7
    for (int rowNumber = 1; rowNumber <= 5; rowNumber++) {
        for (int starNumber = 1; starNumber <= 5; starNumber++) {
            System.out.print("* ");
        }
        System.out.println();

    }
}



