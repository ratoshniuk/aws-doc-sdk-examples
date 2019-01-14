# snippet-sourcedescription:[dynamodb_ruby_example_delete_movies_table.rb deletes the DynamoDb table Movies.]
# snippet-service:[dynamodb]
# snippet-keyword:[Ruby]
# snippet-keyword:[Amazon DynamoDB]
# snippet-keyword:[Code Sample]
# snippet-keyword:[ ]
# snippet-sourcetype:[full-example]
# snippet-sourcedate:[Jan 14, 2019]
# snippet-sourceauthor:[AWS]
#
# Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
#
# This file is licensed under the Apache License, Version 2.0 (the "License").
# You may not use this file except in compliance with the License. A copy of
# the License is located at
#
# http://aws.amazon.com/apache2.0/
#
# This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
# CONDITIONS OF ANY KIND, either express or implied. See the License for the
# specific language governing permissions and limitations under the License.
#
# snippet-start:[dynamodb.Ruby.CodeExample.MoviesDeleteTable]
require 'aws-sdk-dynamodb' # v2: require 'aws-sdk'

Aws.config.update(
  region: 'us-west-2',
  endpoint: 'http://localhost:8000'
)

dynamodb = Aws::DynamoDB::Client.new

params = {
  table_name: 'Movies'
}

begin
  dynamodb.delete_table(params)
  puts 'Deleted table.'
rescue Aws::DynamoDB::Errors::ServiceError => error
  puts 'Unable to delete table:'
  puts error.message
end
# snippet-end:[dynamodb.Ruby.CodeExample.MoviesDeleteTable]
