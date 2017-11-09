import sys
n=sys.argv[1:]
if len(n)==0:
   print('missing value')
else:
  n=int(n[0])
  res=[]
  if n>0:
      res.append(n)
      while n!=1:
              if n%2==0: #è pari
                  n=int(n/2)
                  res.append(n)
              else: #è dispari
                  n=int(3*n+1)
                  res.append(n)
      print(*res)
  elif n==1:
      print("1")
  elif n<=0:
      print("invalid value")