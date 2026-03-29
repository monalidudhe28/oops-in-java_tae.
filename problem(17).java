// 17. Download Manager
// Create a class DownloadManager. Create multiple threads using
// Runnable interface. Each thread represents file download.
// Output: Downloading messages.

class DownloadManager implements Runnable {
    private String fileName;

    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(fileName + " download complete");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager("File1"));
        Thread t2 = new Thread(new DownloadManager("File2"));
        Thread t3 = new Thread(new DownloadManager("File3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
