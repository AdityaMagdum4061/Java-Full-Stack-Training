package interfacedemo;

//Q2. Write a Java program to create two interfaces, Camera and MusicPlayer, and implement both interfaces in a SmartPhone class.

interface Camera {
 void takePhoto();
}

interface MusicPlayer {
 void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
 public void takePhoto() {
     System.out.println("Photo Captured");
 }

 public void playMusic() {
     System.out.println("Playing Music");
 }
}

public class SmartPhoneDemo {
 public static void main(String[] args) {
     SmartPhone phone = new SmartPhone();

     phone.takePhoto();
     phone.playMusic();
 }
}
