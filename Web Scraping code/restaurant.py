from bs4 import BeautifulSoup
import requests
url = 'http://www.yelp.com/sf'
response = requests.get(url)
text1 = response.text
print 
soup = BeautifulSoup(text1)



visited = []
for atags in soup.findAll('a'):
	if "/biz/" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])

print(visited)
exit(0)


import requests
for vis in visited:
	soup1 = requests.get(vis)
	print BeautifulSoup(soup1.text).find('div',{'class':'story'}).text



from bs4 import BeautifulSoup
import requests



url = 'http://www.yelp.com/sf'
response = requests.get(url)
text1 = response.text

soup = BeautifulSoup(text1)


visited = []
for atags in soup.findAll('a'):
	if "/biz/" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])


print visited


for vis in visited:
	soup1 = requests.get(vis)
	print BeautifulSoup(soup1.text).find('span',{'class':'contentm002 genstory'}).text






from bs4 import BeautifulSoup
import requests

url = 'http://www.yelp.com/sf'
response = requests.get(url)
text1 = response.text

soup = BeautifulSoup(text1)
visited = []
for atags in soup.findAll('a'):
	if "/biz/" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])

print visited



for vis in visited:
	soup1 = requests.get(vis)
	print BeautifulSoup(soup1.text).find('div',{'class':'storyhead'}).text





from bs4 import BeautifulSoup
import requests

url = 'http://www.yelp.com/sf'
response = requests.get(url)
text1 = response.text

soup = BeautifulSoup(text1)
visited = []
for atags in soup.findAll('a'):
	if "/biz/food" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])

print visited



# for vis in visited:
# 	soup1 = requests.get(vis)
# 	print BeautifulSoup(soup1.text).find('span',{'class':'contentm001 genstory patrikaFont'})





for vis in visited:
	soup1 = requests.get(vis)
	print BeautifulSoup(soup1.text).find('div',{'class':'story'})







from bs4 import BeautifulSoup
import requests

url = 'http://www.yelp.com/sf/'
response = requests.get(url)
text1 = response.text

soup = BeautifulSoup(text1)
visited = []
for atags in soup.findAll('a'):
	if "/biz/place" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])

# print visited



for vis in visited:
	soup1 = requests.get(vis)
	print BeautifulSoup(soup1.text).find('div',{'class':'story'})



from bs4 import BeautifulSoup
import requests

url = 'http://www.yelp.com/sf'
response = requests.get(url)
text1 = response.text

soup = BeautifulSoup(text1)
visited = []
for atags in soup.findAll('a'):
	if "/biz/price" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])

print visited



for vis in visited:
	soup1 = requests.get(vis)
	print BeautifulSoup(soup1.text).find('span',{'class':'contentm001 genstory patrikaFont'})




from bs4 import BeautifulSoup
import requests

url = 'http://www.yelp.com/sf'
response = requests.get(url)
text1 = response.text

soup = BeautifulSoup(text1)
visited = []
for atags in soup.findAll('a'):
	if "/biz/rating" in atags['href']:
		if atags['href'] not in visited:
			visited.append(atags['href'])

# print visited


# for vis in visited:
# 	soup1 = requests.get(vis)
# 	print BeautifulSoup(soup1.text).find('div',{'class':'story'})




for vis in visited:
	soup1 = requests.get(vis)

	print soup1
	print BeautifulSoup(soup1.text).find('div',{'class':'left'})











