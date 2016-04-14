

import greenfoot.Actor;
import greenfoot.Greenfoot;

import java.nio.file.Path;

public class MenuOption extends Actor {

    private ICommand command = null;

    public MenuOption(String name) {


    }
  public void setCommand(ICommand command) {
        this.command = command;
    }


    @Override
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (this.command != null) {
                command.execute();
            }
        }
    }

  
}
