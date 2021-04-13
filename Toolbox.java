import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class Toolbox
{ 
	JFrame f;
	JPanel panel;

	public Toolbox() throws Exception
    {
        f = new JFrame("Data Science Toolbox");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel(new GridLayout(13,2));


        JButton RStudio = new JButton("RStudio");
        RStudio.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("http://host.docker.internal:8787/");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(RStudio);

        JButton Spyder = new JButton("Spyder");
        Spyder.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("http://localhost:6080/");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Spyder);

        JButton IBMSAS = new JButton("IBM SAS");
        IBMSAS.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("https://welcome.oda.sas.com/login");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(IBMSAS);

        JButton Git = new JButton("Git");
        Git.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			Runtime r = Runtime.getRuntime();
        			r.exec(new String[] {"/bin/bash", "-c", "xterm"});

        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Git);

        JButton Jupyter = new JButton("Jupyter Notebook");
        Jupyter.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("http://host.docker.internal:8888/");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Jupyter);

        JButton VStudio = new JButton("Visual Studio");
        VStudio.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("http://online.visualstudio.com/environments/new");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(VStudio);

        JButton Hadoop = new JButton("Hadoop");
        Hadoop.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			//newURL("http://host.docker.internal:6969/");
                    Runtime r = Runtime.getRuntime();
        			r.exec(new String[] {"/bin/bash", "-c", "xterm"});
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Hadoop);

        JButton Spark = new JButton("Spark");
        Spark.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
                    Runtime r = Runtime.getRuntime();
        			r.exec(new String[] {"/bin/bash", "-c", "xterm"});
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Spark);

        JButton Tableau = new JButton("Tableau");
        Tableau.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("https://sso.online.tableau.com/public/idp/SSO");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Tableau);

        JButton Sonar = new JButton("Sonar Cloud");
        Sonar.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("https://sonarcloud.io/explore/projects");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Sonar);

        JButton Tensor_flow = new JButton("Tensorflow");
        Tensor_flow.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			Runtime r = Runtime.getRuntime();
        			r.exec(new String[] {"/bin/bash", "-c", "xterm"});
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(Tensor_flow);

        JButton mark = new JButton("Markdown");
        mark.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			//Runtime r = Runtime.getRuntime();
        			//r.exec(new String[] {"/bin/bash", "-c", "xterm"});
                    newURL("http://host.docker.internal:12345/");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(mark);

        JButton orang = new JButton("Orange");
        orang.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		try 
				{
        			newURL("http://host.docker.internal:6901/");
        		}
        		catch(Exception e)
        		{
        			e.printStackTrace();
        		}
        	}
        });
        panel.add(orang);
        
        f.add(panel, BorderLayout.CENTER);

		f.setVisible(true); 
    }
    public static void main(String[] args) throws Exception
    {
    	new Toolbox();
    }

    public static void newURL(String url)
    {
        Runtime rt = Runtime.getRuntime();
        
        StringBuffer cmd = new StringBuffer();
        cmd.append(String.format("%s \"%s\"", "firefox", url));

        try 
        {
            rt.exec(new String[] { "sh", "-c", cmd.toString() });
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    
}

