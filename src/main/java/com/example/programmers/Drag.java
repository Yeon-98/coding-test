package main.java.com.example.programmers;

class Drag {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        for(int i=0;i<wallpaper.length;i++)
        {
            if (wallpaper[i].contains("#"))
            {
                lux = Math.min(lux,i);
                rdx = Math.max(rdx,i+1);

                for(int j=0; j<wallpaper[i].length();j++)
                {
                    if(wallpaper[i].charAt(j)=='#')
                    {
                        luy = Math.min(luy,j);
                        rdy = Math.max(rdy,j+1);
                    }
                }
            }
        }

        return new int[] {lux,luy,rdx,rdy};
    }
}
