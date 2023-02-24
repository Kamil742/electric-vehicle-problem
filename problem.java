//   Super Wheels Company sells it's electric 2 wheelers based on the following pattern to it's retail and corporate customers. 
//   Every month it starts selling in the below mentioned pattern  
//   Day 1-One Vehicle  
//   Day 2 Three Vehicles  
//   Day 3-Seven Vehicles  
//   Day 4-Thirteen Vehicles  
//   Day 5-Twenty One Vehicles  
//   Day 6.  
//   Essentially this means 2 extra vehicles each day as the month progresses to what was sold in the previous day For the first 4 days vehicles 
//   are sold to the retail market. Every 5th day all vehicles sold are exclusively to corporate customers only and not in the retail market. 
//   Again 4 days Super Wheels focusses on Retail Market 5th Day to Corporates and this pattern continues from beginning of the month to end of the month  
//   example:  
//     Display the sales information from April 1st to Sep 30th   
//     a. Number of Vehicles sold each month: Display month and sold count:20  
//     b. Number of Vehicles sold to retail customers: 10  
//     c. Number of Vehicles sold to corporate customers: 10  
//     d. Number of Vehicles sold from Aug 15th to Sep 15th 20



class ElectricVehicle {
    public static void main(String[] args) {
        int retailer=0,corparate=0,temp=1,cnt=1,ret=0,cor=0,s=0,aughalf = 272, count=1 ,augsep =0;
       
        int retail[] = new int[6];
        int corp[] = new int[6];
        int sum[] = new int[6];
        String month[] = new String[6];
       
        month[0] = "April";
        month[1] = "May";
        month[2] = "June";
        month[3] = "July";
        month[4] = "August";
        month[5] = "September";
       
       
        for(int a=1;a<=6;a++)
        {
            retailer =0;
            corparate = 0;
            if(a==1 || a==3 || a==6)
            {
       
             for(int i=1;i<=30;i++)
             {
                if(i%5!=0){
                retailer = retailer+temp;
              }
                 else{
                 corparate = corparate + temp;
             }
                temp = cnt*2;
                cnt++;
           
                }
                retail[ret] = retailer;
                corp[cor] = corparate;
                sum[s] = retailer + corparate;
                ret++;
                cor++;
                s++;
               
           
            }
            else{
                for(int j =1;j<=31;j++)
                {
                   
                    if(j%5!=0)
                    {
                       
                        retailer = retailer+temp;
                    }
                    else{
                       
                   
                        corparate = corparate + temp;
                    }
                    temp = cnt*2;
                    cnt++;
                }
               
                retail[ret] = retailer;
                corp[cor] = corparate;
                sum[s] = retailer + corparate;
                ret++;
                cor++;
                s++;
            }
       
           
        }
       
        for(int c=0;c<6;c++)
        {
             System.out.println(" The Sales on Month of "+month[c]);
             System.out.println("\n The Total Number of Vehicle sold: "+sum[c]);
            System.out.println("\n Number of Vehicles Sold to Retail Customers : " +retail[c]);
            System.out.println("\n Number of Vehicles Sold to Corparate Customers: " +corp[c]);
            System.out.println("\n\n");
        }
       

        for(int x=1;x<=32;x++)
        {
            augsep = augsep + aughalf;
            aughalf = count*2;
            count++;
        }
       
        System.out.println(" The Total Sales of vehicle from August 15 to September 15 (32 Days) are: "+augsep);
    }
}
