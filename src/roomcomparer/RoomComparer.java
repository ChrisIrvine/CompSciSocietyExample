/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomcomparer;

import java.util.Scanner;

/**
 *
 * @author Christopher Irvine
 */
public class RoomComparer
{
  public static void main(String[] args)
  {
    Room dthompsan = new Room(false, 22, 54, 5, "SCI 2.94");
    Room congohall = new Room(true,  0, 130, 0, "CH 01.19");

    Room room = null;
    while (room == null)
    {
      System.out.print(
        "Enter details for a new room [lightsWorking tables, chairs, plants, num].\n> "
      );
      Scanner scanner = new Scanner(System.in);
      try
      {
        room = new Room(
          scanner.nextBoolean(), // light
          scanner.nextInt(), // tables
          scanner.nextInt(), // chairs
          scanner.nextInt(), // plants
          scanner.next()); // gobble the rest as room number
      }
      catch (Exception e)
      {
        System.err.println(e.getMessage());
      }
    }

    int n = Math.max(
      dthompsan.getNoOfChairs(),
      Math.max(
        congohall.getNoOfChairs(),
        room.getNoOfChairs()
      )
    );

    System.out.println("The biggest room has " + n + "chair" + (n != 1 ? "s" : "") + ".");
  }
}
