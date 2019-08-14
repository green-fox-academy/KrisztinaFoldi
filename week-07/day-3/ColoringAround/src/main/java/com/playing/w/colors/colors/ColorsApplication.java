package com.playing.w.colors.colors;
import com.playing.w.colors.colors.interfaces.MyColor;
import com.playing.w.colors.colors.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {
  private MyColor myColor;
  private Printer printer;

  @Autowired
  ColorsApplication(Printer printer, MyColor myColor) {
    this.printer= printer;
    this.myColor= myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColorsApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    printer.log(myColor.printColor());
  }
}
