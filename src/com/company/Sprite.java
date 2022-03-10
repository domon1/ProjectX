package com.company;

//Библиотека JavaFX
import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Rectangle2D;

public class Sprite {
    private Image image;
    private double heightSprite;  //Высота спрайта
    private double widthSprite;  //Ширина спрайта
    private double positionSpriteX;  //Позиция спрайта по координате Х
    private double positionSpriteY;  //Позиция спрайта по координате У
    private double velocitySpriteX;  //Скорость перемещения спрайта по Х
    private double velocitySpriteY;  //Скорость перемещения спрайта по У

    //Конструктор класса
    public Sprite() {
        this.positionSpriteX = 0;
        this.positionSpriteY = 0;
        this.velocitySpriteX = 0;
        this.velocitySpriteY = 0;
    }

    //Установка размера спрайта
    public void setImage(Image image) {
        this.image = image;
        this.heightSprite = image.getHeight();
        this.widthSprite = image.getWidth();
    }

    //Изменение размера спрайта (Конструктор Image: (url, высота, длина, сохранение пропорций, сглаживание))
    public void imageResize(String nameSprite, int heightSprite, int widthSprite) {
        Image toResize = new Image(nameSprite, heightSprite, widthSprite, false, false);
        setImage(toResize);
    }

    //Установка позиции спрайта
    public void setPositionSpriteXY(double positionSpriteX, double positionSpriteY) {
        this.positionSpriteX = positionSpriteX;
        this.positionSpriteY = positionSpriteY;
    }

    //Обновление позиции спрайта
    public void Update(double time) {
        this.positionSpriteX += velocitySpriteX * time;
        this.positionSpriteY += velocitySpriteY * time;
    }

    //Отрисовка спрайта
    public void Rendering(GraphicsContext graphCont) {
        graphCont.drawImage(image, positionSpriteX, positionSpriteY);
    }

    //Получение границы спрайта
    public Rectangle2D getHeadBox() {
        return new Rectangle2D(positionSpriteX, positionSpriteY, heightSprite, widthSprite);
    }

    //Обработчик столкновений
    public boolean collisionHandler(Sprite sprite) {
        return sprite.getHeadBox().intersects(this.getHeadBox());
    }

    //Установка и добавление скорости спорайта
    public void setVelocitySprite(double velocitySpriteX, double velocitySpriteY) {
        this.velocitySpriteX = velocitySpriteX;
        this.velocitySpriteY = velocitySpriteY;
    }
    public void addVelocitySprite(double x, double y) {
        this.velocitySpriteX += x;
        this.velocitySpriteY += y;
    }

    //Получение данных переменных
    public double getPositionX() {
        return positionSpriteX;
    }
    public double getPositionY() {
        return positionSpriteY;
    }
    public double getVelocityX() {
        return velocitySpriteX;
    }
    public double getVelocityY() {
        return velocitySpriteY;
    }
    public double getHeightSprite() {
        return heightSprite;
    }
    public double getWidthSprite() {
        return widthSprite;
    }
}
