#include <stdio.h>
#include <curl/curl.h>

int main(void)
{
  CURL *curl;
  CURLcode res;

  curl = curl_easy_init();
  if(curl) {
    curl_easy_setopt(curl, CURLOPT_URL, "https://api.example.com");
    curl_easy_setopt(curl, CURLOPT_CAPATH, "/etc/certs");
    curl_easy_setopt(curl, CURLOPT_CAINFO, "/etc/certs/cert.pem");
    curl_easy_setopt(curl, CURLOPT_USERAGENT, "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0");
    curl_easy_setopt(curl, CURLOPT_REFERER, "https://www.google.com");
    curl_easy_setopt(curl, CURLOPT_HTTPHEADER, "Accept-Language: en-US,en;q=0.5");
    curl_easy_setopt(curl, CURLOPT_COOKIEFILE, "");
    curl_easy_setopt(curl, CURLOPT_COOKIEJAR, "");
    curl_easy_setopt(curl, CURLOPT_PROXY, "http://proxy.example.com:8080");
    res = curl_easy_perform(curl);
    if(res != CURLE_OK)
      fprintf(stderr, "curl_easy_perform() failed: %s\n",
              curl_easy_strerror(res));
    curl_easy_cleanup(curl);
  }
  return 0;
}
