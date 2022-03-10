package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Bird {
    private Sprite bird;
    private ArrayList<Sprite> animate = new ArrayList<>();
    private int birdNumber = 0;
    private int HEIGHT_BIRD = 82;
    private int WIDTH_BIRD = 107;
    private double positionBirdX = 80;
    private double positionBirdY = 160;

    //Конструктор класса
    public Bird() {
        bird = new Sprite();
        bird.imageResize("/resource/bird_sprites/newbird1.jpeg", HEIGHT_BIRD, WIDTH_BIRD);
        bird.setPositionSpriteXY(positionBirdX, positionBirdY);
    }

    //Получение птицы
    public Sprite getBird() {
        return bird;
    }

    //Установка анимации
    public void setAnimation() {
        Sprite bird2 = new Sprite();
        bird2.imageResize("/resource/bird_sprites/newbird2.jpeg", HEIGHT_BIRD, WIDTH_BIRD);
        bird.setPositionSpriteXY(positionBirdX, positionBirdY);

        Sprite bird3 = new Sprite();
        bird2.imageResize("/resource/bird_sprites/newbird3.jpeg", HEIGHT_BIRD, WIDTH_BIRD);
        bird.setPositionSpriteXY(positionBirdX, positionBirdY);

        Sprite bird4 = new Sprite();
        bird2.imageResize("/resource/bird_sprites/newbird1.jpeg", HEIGHT_BIRD, WIDTH_BIRD);
        bird.setPositionSpriteXY(positionBirdX, positionBirdY);

        animate.addAll(Arrays.asList(bird, bird2, bird3, bird4));
    }

    //Функция анимации
    public Sprite Animate() {
        if (birdNumber == animate.size() - 1) {
            birdNumber = 0;
        }
        return animate.get(birdNumber++);
    }
}
