package com.company;

public class Pipe {
    private Sprite pipe;
    private int HEIGHT_PIPE;
    private int WIDTH_PIPE;
    private double positionPipeX;
    private double positionPipeY;

    //Конструктор класса
    public Pipe(boolean pipeUp, int HEIGHT_PIPE) {
        this.pipe = new Sprite();
        this.pipe.imageResize(pipeUp ? "/images/pipe_sprites/pipe_up.jpeg" : "/images/pipe_sprites/pipe_down.jpeg", 70, HEIGHT_PIPE);
        this.WIDTH_PIPE = 70;
        this.HEIGHT_PIPE = HEIGHT_PIPE;
        this.positionPipeX = 400;
        this.positionPipeY = pipeUp ? 600 - HEIGHT_PIPE : 0;
        this.pipe.setPositionSpriteXY(positionPipeX, positionPipeY);
    }

    //Поучение трубы
    public Sprite getPipe() {
        return pipe;
    }
}
