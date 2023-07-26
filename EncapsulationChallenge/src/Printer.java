public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel: -1; //Ternary Operator
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            //to check if the total tonerLevel is still in between 0-100
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages/ 2) + (pages % 2) : pages; //Local variable & Ternary Operator
        /*if it's duplex then it 1 pages it prints 2 times, so we got (page/2) pages(paper)
        but if it's odd number ex. 3 pages then we have to add (pages % 2) */
        pagesPrinted += jobPages;
        return jobPages;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
