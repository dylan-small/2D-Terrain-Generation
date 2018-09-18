package com.dylanscode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.dylanscode.terrain.TerrainGenerator;

public class Main
{
	private TerrainGenerator generator;
	private BufferedImage terrain;
	public void start(int l, int h, String name)
	{
		generator = new TerrainGenerator(l,h);
		terrain = null;
		try
		{
			terrain = generator.generateImage();
			//saves the image to a png file
			ImageIO.write(terrain, "jpg", new File(name));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		new Main().start(100,100,"ds");
	}
}
